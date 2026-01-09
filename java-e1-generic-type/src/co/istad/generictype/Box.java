package co.istad.generictype;

public class Box<T,S> {
    private T data;
    private S secondaryData;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public S getSecondaryData() {
        return secondaryData;
    }

    public void setSecondaryData(S secondaryData) {
        this.secondaryData = secondaryData;
    }
}
