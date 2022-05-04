package hw7.task2;

public class Animal {

    public Number testMethod1(String stringArg) throws Exception {
        try {
            int x =1;
        }
        finally {
            int x=2;
        }

        return 1;

    }

     Number testMethod2(String stringArg)throws Exception{
         try {
             int x =1;
         }
         finally {
             int x=2;
         }

         return 2;

    }

      Number testMethod3(String stringArg)throws Exception{
          try {
              int x =1;
          }
          finally {
              int x=2;
          }

          return 3;

    }
    public Number testMethod4(String stringArg) throws Exception{
        try {
            int x =1;
        }
        finally {
            int x=2;
        }
        return 4;
    }
}
