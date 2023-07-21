public class lec7_arrays {

    //Linear search --> O(n)
//    public static int linerSearch(int numbers[], int key){
//        for(int i=1;i<numbers.length;i++){
//            if(numbers[i]==key){
//                return i;
//            }
//        }
//        return -1;
//    }
//    public static void main(String[] args) {
//        int numbers[] = {2,4,6,8,10,12,14};
//        int key=10;
//
//        int index=linerSearch(numbers, key);
//        if(index==-1){
//            System.out.println("Not Found");
//        }
//        else{
//            System.out.println("Key is at index: "+ index);
//        }
//    }

    //Largest/smallest number --> O(n)
//    public static int getLargest(int numbers[]){
//        int largest=Integer.MIN_VALUE;
//        int smallest = Integer.MAX_VALUE;
//        for(int i=0;i<numbers.length;i++){
//            if(largest<numbers[i]){
//                largest=numbers[i];
//            }
//            if(smallest>numbers[i]){
//                smallest=numbers[i];
//            }
//        }
//        System.out.println(smallest);
//        return largest;
//    }
//
//    public static void main(String[] args) {
//        int numbers[]={2,4,12,8,10};
//        System.out.println(getLargest(numbers));
//    }

    //Binary search
//    public static int binarySearch(int numbers[], int key){
//        int start=numbers[0];
//        int end= (numbers.length)-1;
//
//        while(start<=end){
//            int mid=(start+end)/2;
//            if(numbers[mid]==key){
//                return mid;
//            }
//            if(numbers[mid]>key){
//                end=mid-1;
//            }else {
//                start = mid + 1;
//            }
//        }
//        return -1;
//    }
//
//    public static void main(String[] args) {
//        int numbers[]={2,3,4,6,8,10};
//        int key=6;
//
//        System.out.println("number is at index: "+ binarySearch(numbers, key));
//    }

    //reverse an array
//    public static void reversedArray(int numbers[]){
//        int first=0;
//        int last= numbers.length-1;
//
//        while(first<last){
//            int temp=numbers[first];
//            numbers[first]=numbers[last];
//            numbers[last]=temp;
//
//            first++;
//            last--;
//        }
//    }
//
//    public static void main(String[] args) {
//        int numbers[]={2,4,6,8};
//
//        reversedArray(numbers);
//        for(int i=0;i< numbers.length;i++){
//            System.out.print(numbers[i]+ " ");
//        }
//        System.out.println();
//    }

    //Pairs in an array  --> O(n^2)
//    public static void arrayPairs(int numbers[]){
//        int totalPairs=0;
//        for(int i=0;i< numbers.length;i++){
//            int curr=numbers[i];
//            for(int j=i+1;j< numbers.length;j++){
//                System.out.print("(" + curr + "," + numbers[j] + ")");
//                totalPairs++;
//            }
//            System.out.println();
//        }
//        System.out.println("total pairs: "+ totalPairs);
//    }
//    public static void main(String[] args) {
//        int numbers[]={2,4,6,8,10,12};
//        arrayPairs(numbers);
//    }

    //Sub array
//    public static void printSubArrays(int numbers[]){
//        int totalsum=0;
//        for(int i=0;i<numbers.length;i++){
//            int start=i;
//            for(int j=i;j< numbers.length;j++){
//                int end=j;
//                for(int k=start;k<=end;k++){
//                    System.out.println(numbers[k]+ " ");
//                }
//                totalsum++;
//                System.out.println();
//            }
//            System.out.println();
//        }
//        System.out.println("Total subarrays: "+ totalsum);
//    }
//
//    public static void main(String[] args) {
//        int numbers[]={2,4,6,8,10};
//        printSubArrays(numbers);
//    }


    //Max sub array sum
//    public static void maxSubarraySum(int numbers[]){
//        int currSum=0;
//        int maxSum=Integer.MIN_VALUE;
//
//        for(int i=0;i<numbers.length;i++){
//            int start=i;
//            for(int j=i;j<numbers.length;j++){
//                int end=j;
//                currSum=0;
//                for(int k=start;k<end;k++){
//                    currSum+=numbers[k];
//                }
//                System.out.println(currSum);
//                if(maxSum<currSum){
//                    maxSum=currSum;
//                }
//            }
//        }
//        System.out.println("max sum= " + maxSum);
//    }
//    public static void main(String[] agrs){
//        int numbers[] = {1,-2,6,-1,3};
//        maxSubarraySum(numbers);
//    }
//}

    //Max Subarray Sum(prefix array)

//    public static void maxSubarraySum(int numbers[]) {
//        int currSum = 0;
//        int maxSum = Integer.MIN_VALUE;
//        int prefix[] = new int[numbers.length];
//
//        prefix[0] = numbers[0];
//
//        //calculate prefix array
//        for (int i = 1; i < prefix.length; i++) {
//            prefix[i] = prefix[i - 1] + numbers[i];
//        }
//        for (int i = 0; i < numbers.length; i++) {
//            int start = i;
//            for (int j = i; j < numbers.length; j++) {
//                int end = j;
//
//                currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];
//                if (maxSum < currSum)
//                    maxSum = currSum;
//            }
//        }
//        System.out.println("Max sum = " + maxSum);
//    }
//    public static void main(String[] agrs) {
//        int numbers[] = {1, -2, 6, -1, 3};
//        maxSubarraySum(numbers);
//    }

    //Max subarray sum(KADANE's Algo) --> IMP
//    public static void kadanes(int numbers[]){
//        int currSum=0;
//        int maxSum=Integer.MIN_VALUE;
//
//        for(int i=0;i<numbers.length;i++) {
//            currSum += numbers[i];
//            if (currSum < 0)
//                currSum = 0;
//
//            maxSum = Math.max(currSum, maxSum);
//        }
//        System.out.println("Max sum = "+ maxSum);
//    }
//    public static void main(String[] args) {
//        int numbers[] = {-2,-2,4,-1,-2,1,5,-3};
//        kadanes(numbers);
//    }

    //TRAPPED RAINWATER QUESTION
//    public static int trappedRainwater(int height[]){
//        int n= height.length;
//        //leftmax bound
//        int leftMax[] = new int[n];
//        leftMax[0] = height[0];
//        for(int i=1;i<n;i++){
//            leftMax[i] = Math.max(height[i], leftMax[i-1]);
//        }
//
//        //rightmax bound
//        int rightMax[] = new int[n];
//        rightMax[n-1] = height[n-1];
//        for(int i=n-2;i>=0;i--){
//            rightMax[i] = Math.max(height[i], rightMax[i+1]);
//        }
//
//        int trappedWater=0;
//        //loop
//        for(int i=0;i<n;i++){
//
//            //water level = min(leftmax bound, rightmax bound)
//            int waterLevel = Math.min(leftMax[i], rightMax[i]);
//
//            //trapped water = waterlevel-height
//            trappedWater += waterLevel - height[i];
//        }
//        return trappedWater;
//    }
//    public static void main(String[] args) {
//        int height[] = {4,2,0,6,3,2,5};
//        System.out.println(trappedRainwater(height));
//    }

    //Buy and Sell Stocks
    public static int buyAndSellStocks(int prices[]){
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i=0;i<prices.length;i++){
            if(buyPrice < prices[i]){       //profit
                int profit = prices[i] - buyPrice;  //today profit
                maxProfit = Math.max(maxProfit, profit);
            }
            else{
                buyPrice = prices[i];
            }
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int prices[] = {7,1,5,3,6,4};
        System.out.println(buyAndSellStocks(prices));
    }
}