package roteiro5.parte3;

public class InocenteSinleton
{
	private void InocenteSinleton()
	{
	}
	
	public static InocenteSinleton getInstance()
	{
		return new InocenteSinleton();
	}
}
