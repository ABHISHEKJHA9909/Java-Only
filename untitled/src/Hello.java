public class Hello {
    int a;
    String b;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }

    public Hello(int a, String b) {
        this.a = a;
        this.b = b;
    }

    /**
     * 
     */
    public Hello() {
        super();
    }

    /**
     * @return 
     */
    @Override
    public int hashCode() {
        return super.hashCode();
    }

    /**
     * @param obj 
     * @return
     */
    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    /**
     * @return 
     * @throws CloneNotSupportedException
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    /**
     * @return 
     */
    @Override
    public String toString() {
        return super.toString();
    }
}
