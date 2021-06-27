package tt.ss.rr;

/**
 * SystemProperty
 * 
 * @author Tyousaryuu
 *
 * 2021年6月26日
 */
public class SystemProperty {
	public static void main(String[] args){
		System.out.println("Default VM arguments:");
		System.out.println("\t" + "java_vendor:" + System.getProperty("java.vendor"));
		System.out.println("\t" + "java_vendor_url:" + System.getProperty("java.vendor.url"));
		System.out.println("\t" + "java_home:" + System.getProperty("java.home"));
		System.out.println("\t" + "java_class_version:" + System.getProperty("java.class.version"));
		System.out.println("\t" + "java_class_path:" + System.getProperty("java.class.path"));
		System.out.println("\t" + "user.dir:" + System.getProperty("user.dir"));// 项目所在的绝对路径 java虚拟机启动路径（命令解释器的当前路径）
		System.out.println("\t" + "workspace_loc" + System.getProperty("workspace_loc"));
		
	}
}
