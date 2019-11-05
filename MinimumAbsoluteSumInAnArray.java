 // Complete the minimumAbsoluteDifference function below.
    static int minimumAbsoluteDifference(int[] arr)
    {
      Arrays.sort(arr);
      int length = arr.length;
      int mainDifference = Integer.MAX_VALUE;
      for (int i=0; i<length-1; i++)
      {
          int difference = Math.abs(arr[i+1] - arr[i]);
          
          if(difference < mainDifference)
          {
              mainDifference = difference;
          }
          
      }

      return mainDifference;

    }