 // Complete the whatFlavors function below.
    static void whatFlavors(int[] cost, int money) 
    {
        int [] result = new int [2];
       

        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        
        for (int i=0; i<cost.length;i++)
        {
            map.put(cost[i], i);
        }

        for(int i=0; i< cost.length; i++)
        {
            int complement = money - cost[i];

             if(map.containsKey(complement)&& map.get(complement)!=i)
           {
                result [1]=i+1;
                result[0] = map.get(complement)+1;  
           }
        }

        Arrays.sort(result);
        System.out.println(result[0]+" "+result[1]);
    }
