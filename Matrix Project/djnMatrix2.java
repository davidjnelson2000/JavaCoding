public class djnMatrix2
{
   private int[][] matrix2;
   
   public djnMatrix2(int content[][])
   {
      matrix2 = new int[content.length][content.length];
      
      for (int i = 0; i < content.length; i++)
         matrix2[i] = content[i];
   }
   
   //public int Matrix()
   //{
      
   //}
   
   public int Test()
   {
      return matrix2[1][1]; 
   }
}