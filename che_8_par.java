public class che_8_par {
    public static void main(String[] args) {
       /* float [] marks= {88.0f,83.0f,78.0f,70.3f,100.0f,60.0f,60.0f};
        float sum =0;
        for(float element:marks){
            sum = sum + element;
        }
          System.out.println("the value of sum is" +sum);*/
        //practice problem 2
        float [] marks= {88.0f,83.0f,78.0f,70.3f,100.0f,60.0f,60.0f};
        float num =45.87f;
        boolean isInArray =false;
        for(float element:marks){
            if (num==element) {
                isInArray =true;
                break;
            }
        }
        if(isInArray){
            System.out.println("the value is present in the array");
        }
        else {
            System.out.println("The value is not present in tne array");
        }

    }
}
