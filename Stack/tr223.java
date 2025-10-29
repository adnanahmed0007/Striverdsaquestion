package Stack;

public class tr223 {
public void sass(int nums[])
{
    int i=0;
    for(int j=1;j<nums.length;j++)
    {
        if(nums[i]!=nums[j])
        {
            i++;
            nums[i]=nums[j];

        }
    }
    for(int k=0;k<=i;k++)
    {
        System.out.println(nums[k]);
    }

}
    
}
class main891xsds1111
{
    public static void main(String[] args) {
        tr223 btr=new tr223();
        int nums[]={0,0,1,1,1,2,2,3,3,4};
        btr.sass(nums);
    }
}