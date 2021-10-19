package my3des;


public class TestDemo {

    /**
     * @param args
     */
    public static void main(String[] args) {
        String msg = "3DES加密解密案例";
        System.out.println("【加密前】：" + msg);

        //加密
        byte[] secretArr = SecretUtils.encryptMode(msg.getBytes());
        System.out.println("【加密后】：" + new String(secretArr));

        //解密
        byte[] myMsgArr = SecretUtils.decryptMode(secretArr);
        System.out.println("【解密后】：" + new String(myMsgArr));
    }
}
