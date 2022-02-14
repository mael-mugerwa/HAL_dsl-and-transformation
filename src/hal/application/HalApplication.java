package hal.application;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceFactoryImpl;

import hal.HALSystem;
import hal.HalFactory;
import hal.HalPackage;
import hal.util.HalAdapterFactory;
import hal.util.ResourceHelper;
import hal.view.HalPage;

public class HalApplication {
	private static HALSystem halSystem;
	private static String filename = "data/data.hal";

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Initialize hal package and prepare resource helper
        HalPackage.eINSTANCE.eClass();
        ResourceHelper.INSTANCE.addResourceFactory("hal", new ResourceFactoryImpl());
		
		// start UI
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HalPage().setVisible(true);
            }
        });
	}
	
	public static HALSystem getHALSystem() {
		// make sure that only one instance of Hal exists
		if (halSystem == null) {
			halSystem = load();
		}
 		return halSystem;
	}
	
	public static void save() {
		ResourceHelper.INSTANCE.saveResource(halSystem, filename);
	}
	
	public static HALSystem load() {
		HALSystem halSystem;
		try {
			Resource resource = ResourceHelper.INSTANCE.loadResource(filename);
	        halSystem = (HALSystem) resource.getContents().get(0);
	    } catch (RuntimeException e) {
			// model cannot be loaded - create an empty HALSystem
			halSystem = HalFactory.eINSTANCE.createHALSystem();
			halSystem.setHomeAddress("My Address");
		}
		return halSystem;
	}
}