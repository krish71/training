package ax3;

import javax.annotation.Resource;

@Resource()
public class ResourceProvider {
	public ResourceProvider() {
		System.out.println("Provider constructor");
	}

	private static ResourceProvider provider;

	public static ResourceProvider getProvider() {
		System.out.println("Provider singleton");
		if (provider == null)
			provider = new ResourceProvider();
		return provider;
	}
}
