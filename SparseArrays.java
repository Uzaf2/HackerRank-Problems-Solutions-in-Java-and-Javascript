// Complete the matchingStrings function below.
    static int[] matchingStrings(String[] strings, String[] queries) 
    {
        int [] occurence= new int[queries.length];

        for (int i=0;i < queries.length; i++)
        {
            for(int j=0;j < strings.length; j++)
            {
                if (queries[i].equals(strings[j])) 
                {
                    occurence[i] = occurence [i]+1;
                }
            }  
        }

        return occurence;
    }