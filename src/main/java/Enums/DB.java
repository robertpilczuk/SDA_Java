package Enums;

public enum DB {
    INSTANCE{
        private String[] db;

        @Override
        public String[] getDb(){
            return db;
        }
    };

    public String[] getDb(){return null;};
}
