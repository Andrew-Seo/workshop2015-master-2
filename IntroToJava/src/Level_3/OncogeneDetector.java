package Level_3;

import java.util.ArrayList;

public class OncogeneDetector
{

	public boolean isOncogene(ArrayList<String> healthySequences, ArrayList<String> cancerSequences, String string)
	{
		if (healthySequences.contains(string))
		{			
			return true;
		}
		if (cancerSequences.contains(string))
		{			
			return false;
		}
		return false;
	}

}
