// Question description from HackerRank  ///
//You are given an unordered array consisting of consecutive integers  [1, 2, 3, ..., n]
// without any duplicates. You are allowed to swap any two elements. You need to find the minimum number of swaps required to sort the array in ascending order.

// Complete the minimumSwaps function below.
function minimumSwaps(arr) 
{
let swaps = 0;
let newArr = arr;

for(let i=0; i<newArr.length; i++)
{
    
    // Biggest difference from it in the array, then replace by it
    let index = largestDifference(i, newArr);
    //console.log("Value of index"+index);

    if (index ==-1)
    {

    }
    else 
    {
        if (arr[i] > arr[index])
        {
             //console.log("Values of "+arr[i]," "+arr[index])
            newArr = swap(arr,i, index);
            swaps ++;
        }
    }
    
   
    //console.log("Values in the new Array"+newArr);
}

return swaps;
}
function swap (arr, a,b)
{
    let temp = arr [a];
    let temp2 = arr [b];

    arr[a] = temp2;
    arr[b] =  temp;

    return arr;
}


function largestDifference(a, arr)
{
   let max = 0;
   let index = -1;
   let value = arr[a];
   
  
   for (let i= a+1; i< arr.length; i++)
   {
       let difference = value - arr[i];
       //console.log("Value of difference: "+ difference+ " index: "+index)
       if (difference > max && difference > 0)
       {
           max = difference;
           index = i;
       }
   }

   return index;
}