import java.util.Scanner;
class tp {
    public int[] twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    return new int[]{i,j};
                }
            }
            
        }
        return new int[]{-1,-1};
    }
    public static void main(String args[]){
     Scanner sc=new Scanner(System.in);
     System.out.println("enter the size");
     int size=sc.nextInt();
     int [] nums=new int[size];
     System.out.println("Enter the elements");
     for(int i=0;i<nums.length;i++){
         nums[i]=sc.nextInt();
     }
     System.out.println("enter the target");
     int target=sc.nextInt();

     tp obj=new tp();
     int[] result=obj.twoSum(nums,target);

     if(result[0]==-1){
        System.out.println("no solution found");
     }
     else{
        System.out.println("indices are"+" "+result[0]+" "+result[1]);
        }
        
     }
     

     


    }
