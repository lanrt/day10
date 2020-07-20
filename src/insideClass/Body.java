package insideClass;

public class Body{
        int a = 10;
        public void work(){
            System.out.println("工作");
        }
        public void boom(){
            System.out.println("炸");
        }
        public class Heart{
            int a = 20;
            public void boom(){
                System.out.println("跳");
                System.out.println(this.a);//  = 20
                System.out.println(Body.this.a);  //  = 10
                work();
            }
            public void text(){
                boom();
                Body.this.boom();
            }

        }
    }

