// Complete the maximumToys function below.
    static int maximumToys(int[] prices, int k)
    {

          int n = prices.length;
     // Used bubble sort to sort the algorithm, 
       Arrays.sort(prices);

     int sum = 0;
     int count = 0;
     for (int i=0; i< n; i++)
     {
         if (sum <= k)
         {
            sum =  sum + prices[i];
            count++;
         }
     }

     return count-1;

    }