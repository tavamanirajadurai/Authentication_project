package newpackage1;
public class NewClass{
    public static void main(String args[]){
        int a[]={1 ,0 ,1 ,1 ,1 ,1 ,1 ,0 ,0 ,0};
        int s=0,j=-1;
        for(int i=0;i<=a.length-1;i++){
            if(a[i]<1){
                j++;
                s=a[i];
                a[i]=a[j];
                a[j]=s;
            }
        }
        for(int i:a){
        System.out.print(i);
        }
    }
}