
public class QuesOne {
	
	static String[] initProductNames()
	{
		String[] productNames = new String[]{"IBM","MINDTREE","COGNIZANT","PERSISTENT"};
		return productNames;
		
	}
	static boolean isPresent(String[] productNames, String keyword)
	{
		
		String key = keyword.toLowerCase();
		String search;
		for(int i=0; i<productNames.length; i++)
		{
			search=productNames[i].toLowerCase();
			if(search.contains(key))
			{
				return true;
			}
		}
		return false;
	}

}
