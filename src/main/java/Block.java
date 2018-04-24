public class Block {

    private String hash;
    private String prevHash;
    private String data;
    private long timeStamp;
    private int nonce;

    public Block(String data, long timeStamp) {

        setData(data);
        setTimeStamp(timeStamp);

        setHash("");
        setPrevHash("");

    }

    public String getHash() { return hash; }

    public void setHash(String hash) { this.hash = hash; }

    public String getPrevHash() { return prevHash; }

    public void setPrevHash(String prevHash) { this.prevHash = prevHash; }

    public String getData() { return data; }

    public void setData(String data) { this.data = data; }

    public long getTimeStamp() { return timeStamp; }

    public void setTimeStamp(long timeStamp) { this.timeStamp = timeStamp; }

    public int getNonce() { return nonce; }

    public void setNonce(int nonce) { this.nonce = nonce; }

}