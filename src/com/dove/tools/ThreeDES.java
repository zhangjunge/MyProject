package com.dove.tools;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESedeKeySpec;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.util.Map;
import java.util.TreeMap;

public class ThreeDES {
	private static final String Algorithm = "DESede";
	public static String vipkey = "ERERIhERERERERERERERERERERMxERER";

	/**
	 * 加密数据
	 * @param sdata	需要加密的数据
	 * @param skey	密钥
	 * @return
	 */
	public static String encryptMode(String sdata, String skey) {
		try {
			byte[] key = new BASE64Decoder().decodeBuffer(skey);
			byte[] data = sdata.getBytes("UTF-8");

			Key deskey = null;

			DESedeKeySpec spec = new DESedeKeySpec(key);
			SecretKeyFactory keyfactory = SecretKeyFactory.getInstance(Algorithm);

			deskey = keyfactory.generateSecret(spec);

			Cipher cipher = Cipher.getInstance("desede/ECB/PKCS5Padding");
			cipher.init(Cipher.ENCRYPT_MODE, deskey);
			byte[] bOut = cipher.doFinal(data);
			return new BASE64Encoder().encode(bOut);
		} catch (NoSuchAlgorithmException e1) {
			e1.printStackTrace();
		} catch (NoSuchPaddingException e2) {
			e2.printStackTrace();
		} catch (Exception e3) {
			e3.printStackTrace();
		}
		return null;
	}

	/**
	 * 解密需要的数据
	 * @param sdata	需要解密的数据
	 * @param skey	密钥
	 * @return
	 */
	public static String decryptMode(String sdata, String skey) {
		try {
			byte[] key = new BASE64Decoder().decodeBuffer(skey);
			byte[] data = new BASE64Decoder().decodeBuffer(sdata);

			Key deskey = null;

			DESedeKeySpec spec = new DESedeKeySpec(key);
			SecretKeyFactory keyfactory = SecretKeyFactory.getInstance(Algorithm);

			deskey = keyfactory.generateSecret(spec);
			Cipher cipher = Cipher.getInstance("desede/ECB/PKCS5Padding");

			cipher.init(Cipher.DECRYPT_MODE, deskey);
			byte[] bOut = cipher.doFinal(data);
			return new String(bOut, "UTF-8");
		} catch (NoSuchAlgorithmException e1) {
			e1.printStackTrace();
		} catch (NoSuchPaddingException e2) {
			e2.printStackTrace();
		} catch (Exception e3) {
			e3.printStackTrace();
		}
		return null;
	}

	public static void main(String[] args) {

		System.out.println("NWlqJbpx1wDqCp6Fa47mhDc70o+teGfDnNXzQK5CHLP/9xZGNbgmlg==".length());
		Map<String, String> map = new TreeMap<String, String>();
//		map.put("80002000001", "f395e2c9282df8358cabf7e4b33b431c");
//		map.put("80002000002", "2e10f12f71035b47a9481bb9b0295e12");
//		map.put("80002000003", "8d993e90c2905c7599dc56b0b152c11a");
//		map.put("80002000004", "f8c7b7feddf964200fd44391dfce720b");
//		map.put("80002000005", "59bd1c73f7c889dc76b2726d9bf97611");
//		map.put("80002000006", "aaa4f755a34299e19e42868a3c3e52cf");
//		map.put("80002000007", "b243c0b8fb0a02b68ab68a08c9f4ccf5");
//		map.put("80002000008", "0b01e7fd5bae3e59315707f51101d9d8");
//		map.put("80002000009", "7317cf0623a910e061d6c064ffee4ca7");
//		map.put("80002000009", "7317cf0623a910e061d6c064ffee4ca7");
		map.put("80002000010", "c10370fb9dbd728b1a42ba9f71c52051");
		map.put("80002000011", "da8bda2426aaab6eb6df80b03b4564bd");
		map.put("80002000012", "e43cfb37e2efd6dd61995d9da11379b5");
		map.put("80002000013", "d6183b8f109ee550fc770cdf50c6af82");
		map.put("80002000014", "6353357c235fbf24ecace1bd064ff348");
		
		map.put("80002000015", "7c97112406f5762cdaecdcb42446195d");
		map.put("80002000016", "59312e122cce8c0035636ef317032c67");
		map.put("80002000017", "e716f75beb31accff7c75882436068c1");
		map.put("80002000018", "dac54d2231b1075c659a3ee729b4ad84");
		map.put("80002000019", "9d630f27ac551f504b8eeb73c87c614a");
		
//		String skey = "ERERIhERERERERERERERERERERMxERER";
//		for (int i = 80010; i < 80020; i++) {
//			Date date = new Date();
//			DateFormat df = new SimpleDateFormat("yyyyMMddHHmmssSSS");
//			String time = df.format(date);
//			String r = i+time;
//			String des = encryptMode(r, skey);
////			System.out.println("鍔犲瘑涔嬪悗鐨勬暟鎹細"+des);
//			String key = Md5Encrypt.md5(des);
//			System.out.println("加密之后的密文"+key);
//			System.out.println("---------------------------");
//		}
//		map.put("", "");
		for (Map.Entry<String, String> entry : map.entrySet()) {
			System.out.println("key= " + entry.getKey() + " and value= " + entry.getValue());
			String mode = encryptMode(entry.getValue(), entry.getKey()+vipkey);//693c2872226b0d4c9ceeeb20ad87731c
			System.out.println("密文:"+mode);
			System.out.println(decryptMode(mode, entry.getKey()+vipkey));
		}
		System.out.println("------------------");
		String mode = decryptMode("6JZBddpR8v+ktt+HlAjcxE4Um5Y1KQWlVK/HAeWIwbYat2oTx/zfcQ==", "80002000010"+vipkey);//693c2872226b0d4c9ceeeb20ad87731c
		System.out.println("密文:"+mode+"|"+mode.length());
//		String result = decryptMode(mode, "80002000001"+skey);
//		System.out.println("原文"+result);
//		System.out.println("原文693c2872226b0d4c9ceeeb20ad87731c");
//		System.out.println("693c2872226b0d4c9ceeeb20ad87731c".equals(result));
//		String sdata = "Z/1lcibf658hdLNS+3j8WzqBFKhniu70M0yY53SUmWVD8rO9zoDIqhLXemumfwUE/5dPJ7XSmA3XjAa06rl8fiqAoxejSK+MJUZT2tcUWCw=";
//		System.out.println(decryptMode(sdata, "1172d5e647adb62f357fd46825b1ffa5"));
//		String skey = "b243c0b8fb0a02b68ab68a08c9f4ccf5";
//		System.out.println(encryptMode("蒋伟", skey));
//		System.out.println(encryptMode("341225198708280516", skey));
//		System.out.println(encryptMode("1383838438", skey));
//		System.out.println(encryptMode("6228480402564890018", skey));
//		
//		System.out.println(encryptMode("苑波", skey));
//		System.out.println(encryptMode("13040319830115123X", skey));
//		System.out.println(encryptMode("1363838438", skey));
//		System.out.println(encryptMode("6228480402564890018", skey));
		
	}

}