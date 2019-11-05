static int hourglassSum(int[][] arr)
    {   
        
     ArrayList <Integer> list = new ArrayList<Integer>();
     int xLength = arr.length;
     int yLength = arr[0].length;
     int endXLength = xLength - 2;
     int endYLength = yLength - 2;

    for (int i=0; i<endXLength;i++)
    {
        for (int j=0; j<endYLength; j++)
        {
            int element1, element2, element3, element4, element5, element6, element7;
            int intermediateSum = 0;

            element1 = arr[i][j];
            element2 = arr[i][j+1];
            element3 = arr[i][j+2];
            element4 = arr[i+1][j+1];
            element5 = arr[i+2][j];
            element6 = arr[i+2][j+1];
            element7 = arr[i+2][j+2];
            intermediateSum = element1 + element2 + element3 + element4 + element5 + element6+ element7;

            list.add(intermediateSum);

            


        }
    }
    return Collections.max(list);
    }
