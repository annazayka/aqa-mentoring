package hw7.task2;

public class Cat extends Animal{
@Override
    public Number testMethod1(String stringArg) throws Exception{
    try {
        int x =1;
    }
    finally {
        int x=2;
    }

    return 11;

    }
    @Override
    public Number testMethod2(String stringArg) throws Exception{
        try {
            int x =1;
        }
        finally {
            int x=2;
        }

        return 22;

    }
    @Override
    Integer testMethod3(String stringArg) throws Exception{
        try {
            int x =1;
        }
        finally {
            int x=2;
        }

        return 33;

    }
@Override
    public Number testMethod4(String stringArg) throws RuntimeException{
    try {
        int x =1;
    }
    finally {
        int x=2;
    }

    return 44;
}
}
