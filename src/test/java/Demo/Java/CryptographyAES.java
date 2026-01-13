package Demo.Java;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.util.Base64;

public class CryptographyAES {


    public CryptographyAES() {

    }


    public static String decryptFile(String encryptedData, String seckey) {
        String decdata = null;
        try {
            // Convert the secret key into bytes and create a key spec
            byte[] key = seckey.getBytes();
            byte[] keyBytes = new byte[16]; // AES key length is 16 bytes
            int len = key.length;
            if (len > keyBytes.length) {  
                len = keyBytes.length;
            }
            System.arraycopy(key, 0, keyBytes, 0, len);
            SecretKeySpec keySpec = new SecretKeySpec(keyBytes, "AES");

         
            IvParameterSpec ivSpec = new IvParameterSpec(keyBytes);

          
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(Cipher.DECRYPT_MODE, keySpec, ivSpec);
            
            

         
            byte[] encryptedBytes = Base64.getDecoder().decode(encryptedData);


            byte[] decryptedBytes = cipher.doFinal(encryptedBytes);

      
            decdata = new String(decryptedBytes, "UTF-8");

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return decdata;
    }

    public static void main(String[] args) {
        
        String data ="yV0pKvyZmmUJpzM1vFzdBYZUPSJv04IstdbvEsHFHfi91jTlBm2MX2aG3mKKHSB87E5MFSRRWk6t\r\n"
        		+ "g9sV5bRNb3KvWlvkujz745XOPxkiuj57j49EpfwLCPt6GKmN75rPaf05z29C29NdyRFbxrTWPNVA\r\n"
        		+ "NnTaiWGBy0BZMVpKPWawuwYdIkiwWMclLY5oTmNrR4EwgfaN14l7ikweRbTYJsw9cnbSi0lNYFOE\r\n"
        		+ "/OHe9YICDeyBol+1l1JGq1eJLiiTe2PnecnyK9xlAd1nvWs9LZ1PDBonroNZpp6enV0bzHIHDGoc\r\n"
        		+ "e6dORNo/TZkGZzaoxQkbwEIJtCGuS03HLhcf1e0NEQMbUUmzxVPcVtwvqtQwLW8IAGs7lwiJa5JX\r\n"
        		+ "qAFpPrRr9Jf+kcjAZQDQYSS2ecIh/mgk7lBjq0xI984P1lTvPKUPnUEm6SOIxCHogRcJeMarNlNq\r\n"
        		+ "Hlzz6UI4V7g27r7bkuUhCikO5VGxClopPwSmxB3QsZKWnd4Wtoh98AM9thlI4LxwCwbNP27+0oE1\r\n"
        		+ "yxZvdSAsnLPtf7rEhZzO2ptGqWeHveBLJOChbSKZXy+kqJ8v9MT5YkqFHgGGg6uI6lMUKgByTpz3\r\n"
        		+ "0z0we8Wh7c2ROTGBQzIdNCtW8B8Gqa2QSAd/dwgMkRqt8tKQbJhBUSWAyZWkNljT25uKscjvLEG0\r\n"
        		+ "XkpYoOVH/FNyL08loeknRezEt4bGdrK7VaZqjNPS9datavI4c7s4HCsU6W1y25oiWxExohx07hG1\r\n"
        		+ "VNLxRQxreEm3AM7BFXvY9+D2Vao5BphOKL0L5vp823sBhqggrv6ePUVmVLBE/vzYweuC6NXO2d9t\r\n"
        		+ "FFHYxO9Zrv3hnD3JhJ4cDp4wrzHG4fbyO+HgzapJcX3Ybt3EEBpUH9zP/Cvd+1UEhLlFLZvgH9iw\r\n"
        		+ "JisyzQ6Ece4Gj9BsfhYiftuwbSJ4XwGzXe7Vq8PciANnimhMVI3GiU7b+7V8fg4OWxHIz5RyWxEL\r\n"
        		+ "cKy5ra1gt0YvWHRO55p/8GsDC9ZorVrnUMwt/QjZppp52eJouGsN79+zKqbO4OgMkAuOqHtFkCw1\r\n"
        		+ "WnsxKbu5JWHyr4IeXfSfY1rHiAvPz9KMWf9W+p9DhbLzlmvd5lPGZicwGSEFLI9dCYo0aUUl0HZq\r\n"
        		+ "lk00r+zj+E94+E6JYoj4sS99W/x/XF2syWGKrQSiiiLPi1IZ3Uhdt/AF0CAsu1anYApf4PDUWJmW\r\n"
        		+ "sL8VDKSpB7SRQ5u2vbS8Squ0Ga4HQ0oyUOLJm4cMKkp1TF5gXZ/d921n0sUDPk/AcF1CBH19tXAa\r\n"
        		+ "NpYkpNKqtGE1yCQMMoFGUkEBkrgPPDxk89mxgCEI4zBldp594hloSfUNdH/VkC3azuNZfaB/tl2k\r\n"
        		+ "6RLOfYPj/kg2n2NM/saebVF/yeGSIXV94ijFr6VqmfHPddHyjtyN612T7dPy38jlj1Hp4vLE6pfp\r\n"
        		+ "HPynn35S5/9CdkenGsTpT3CSjP1HZTYa3kiF+NYv6U4E97hSNOtz/NTgIc2aynWOdco+yDrjAn1k\r\n"
        		+ "DAsl6tHcLElfIEitkyY31X04RsmWNakzXXEOS8bQEaD4u7hKA8Mm8LLnm+rMSdPV2TV/ViDEWUdH\r\n"
        		+ "R/3SORDehBsTVrHEKk/OT1wL3pDTijKAUIEU623/Sfz+vQ+zZlTn69MjoQsPTyhSpfazEZb2+ExR\r\n"
        		+ "s4GbA/UxByczaR607t4DxQ2ut/PQFX5YmfHzIBRY4Cij3bYFZwKuijSka4uk35olJZ/DtUAgQLpb\r\n"
        		+ "5yv4dFS02qFSC64dl4G6KIWCxH8Ok1ExwON6/xFS2lvCmNZJzzT/+raJWbDziMlFWsK9OhqbFNLT\r\n"
        		+ "HCZ3/3lod5CdAgWtJ4wAnpQh1viycgvPtPYKJPYFQKUfHdPCkfbDcHChs66o4syEZMPjoglc3v2a\r\n"
        		+ "pBMIPS0PivA6NKym/KEfe0mZeE7zyM4K9i1NJUy1Uh26QX9fJC220k1brFf4+q0IJ/21z1q74ELY\r\n"
        		+ "80n8zqG/Yb2NugCa3emgKYmSqPCL1EHYprJPYxDCM+fb+KIJNEDt2wXDChi8zWM7hqmlbaO0Bj8U\r\n"
        		+ "rzwO49P6NWQiA405BRFeOQqbNX6QLR7rpqxu3Vyjq32ynfgWULTAsJvfqPApJ+6CpunqYoQ0Gz8Z\r\n"
        		+ "J3cOkmXH/NfwWqIdvlHrQdqz64VmrercM9SnONFlIJ8f14WSxXINIjP9whSzGAK+OfyypLlJw5h2\r\n"
        		+ "OLKt+sDOOwYaXAR6mWGk2f3JN07I1SARxD8OBfaOCJkx6VrnIJAyYJORI3tBAAdF+mFHXfdbVa9v\r\n"
        		+ "tvK5xqN5lakzCGfrQyUlTgebHJhSi2O0BrbeeVU1jmaBlHnkYu+NVGW/iJ2evnlmlg14hk3L7ruU\r\n"
        		+ "oSdinzL4TBxHrS9k0jAfQcxDpcj73fNsaS7NhxXmLjGChXZZk+y6EiDB0BZLb+YiTfL6UztjxznS\r\n"
        		+ "RpAHcgSdASAaekBBfS6FA3dAHydyEYsk5eiGYDl/rBdVPB2/No/D9dUL2KJgfKDREhvRkvKS7fFm\r\n"
        		+ "0JL5SUb0+22Gy9EnbgRT8T/UNrrpWKkG4K1S2En4G71VW7yKpEmk86wV/HWGQ1HNd4z3ShVhc7Zv\r\n"
        		+ "T3aGJgQmX0ZDLA54wu2k/EFEvP+QG8rteOuHPEmrF4JUqqcMpKg2dHpELU7Mm4U9kpWtrkOJuA9/\r\n"
        		+ "2D5jVTFuuLLO6wXm0kvxkShS/Xp8NS4FFb0gHOH9N7O7ffJ6wyXs22jfehhup/qR74Hm0oQNuTzg\r\n"
        		+ "6z9JqhMnbyCNZw80MVbaEXNvkF0ysHbKjC/p+EmbUqamWY5+jQkL1QaQO06cikpj4TPX68K7g18J\r\n"
        		+ "1x8ltzvzbwQUILI3ohcLRHiL22Qo6CFHJZD771cBWUvfglzdXUxMAKBqn0bx8cqjjrrW3/EErC/I\r\n"
        		+ "efNIqDU2ccesBn+R54IynVoavYPRTtvfdcI4l/dTWte6j8Gu9+0fpPxYoSn9Se80NnIqCZFM1rE2\r\n"
        		+ "F9LFIdmIjRQ3xcA/tMCaVWrATggusQTW1tVEXoAb1Knv+pyL6z9O7m2P+X+/7lFBzMn1EH0MPBuy\r\n"
        		+ "wMHAwaznhytX/HJSYZ1L2JE7XscfbFRPwhjHjOd/EDc1qBNo5A+VwY7q6j7ghcYW7TwjaJrAnopq\r\n"
        		+ "l9mqcjAJrelLwciiLtWevXR3TF+kGABilmwr+29snD5tx+J3+kMBmXiLdcx+TcZWwheJxOQI/9Z2\r\n"
        		+ "CchXIc30IuHdBeuEP8Di+f9LRssIBkETDu1w/BBz6iyvcUbkaLeK6z5i0mWb15Y7PAqxbynuvqF/\r\n"
        		+ "iiPjHJmoGnmSs/D8EmucBW/R9uYMRfIQvePGDp1JTYar88i9v7OhtglebZcp9knx0CeOzioJC2IB\r\n"
        		+ "J7ZRX/h5NSFQ2RRpdr6YKCiqbavI7y+wsjLHXZppK3kP4EZsxwGLgzSttxI5ZKCgyYFtPDRXZfQ2\r\n"
        		+ "Q8RdB4jrnE4+TeApYZULBRdS3ClQ5t0s7icVbLgZUO5H6+qPb1yHF56Jzl7biMof/JixmPa/RFgB\r\n"
        		+ "4HrdrKHSw3/vKGrn2hDoy4cDzDt4Md1OcEKCtDT4r2OU+UN5W/71MaaPO6WkMC8l1Pt7Y+eTZLYB\r\n"
        		+ "Zb5ArZtHjMY5EIacZXQGCDfqV4IGhFxTHIWHJ8/2c8ioidydAP482vdYj0WY61LB6dmfg2zzKliS\r\n"
        		+ "Ouy26UEjXSYWvug9reT2LE7LY3tbHEkMAMXWzu9XehKtHGyP3/qV8xE07XbXGcqMrfJMSC+Ha+C1\r\n"
        		+ "pTEetN+Rr9MyXUA6iJ1XwZ+pLByP8MVWLvDN3Wp0Ya+uHJTP/FkrHryHPn3gI4bTcpKFF0cfbhd6\r\n"
        		+ "zHFL5VleNO24vRI/S9ICWzhyg32T+2kdA4mPR6QbtCAVQWPNh+Dw4ph1AQP9jGgA1MAM08K/RG5a\r\n"
        		+ "YHTxsoU8KzAs5rZ3FkIcz6zmZETgsowfgOYJwwuHKVNpV+Fe+9af75OaurqzoC8N6L0uufic3XTy\r\n"
        		+ "4nB5l+SiFMuQGds3+OXknKw64y8+sYXWBXVeE4q59zoUqKAH+d0iwtw6NFk2sGFmYvLT8TDnqQi7\r\n"
        		+ "8lYTZDtvd8CgJULe4Ms3IZrk3IxpOT2NNc1qM8ujRT9bF/fTPYEgJlf3opsJ3t4hHUEllqT+Ol6g\r\n"
        		+ "lerH7eHcPhopX9qN0V0V+9zZX/yVVN6DfxqwzolBDTUH3KKDqU/g1WfBb1nr3rIBc3d/0VCewoxs\r\n"
        		+ "4dFgQFxEwXqysw/61mFSkzWLJy3V5YMyJy1lqa7o95ob83LpGqwCYS5wF/PsXhWR+cqst4Xv2V+H\r\n"
        		+ "XDaUkjy8UrfhxT6GlmqyQ2WPDyBzI1wyhO1qlfnbrH78+Hz4SngvJGs0BkyitmTlM+pxeJ6Kng6B\r\n"
        		+ "LgyQiO9Ax4Wq2A9K5LYsdzYWXjEMB2oAbvNDO/5iARnXhn6hIRqAdwbU6lE6yMpXuMojLyNYoQaT\r\n"
        		+ "SfyvZ6HwFdPNjArvRrDE5wdkbBtIJD7QyoEeTfhQg8Wfk3J7gHYLiFQlRTS6/cZy4sxHlB9p0+XA\r\n"
        		+ "VixrKAGfr+eDXmbSl5m06xnr6PcY4YUfrTeTAQwEx0po9EPtn4TIAuCdFscOwoyCKbJp/3IUtwlM\r\n"
        		+ "OO95SLpLik6i/NWsr4+uCbvhKyiFU8Od4an1jwuwKIFZj2qlV1JmUh7toU93WNLe2varb4b3JZjL\r\n"
        		+ "sAhHVR68hUHOMylAMhvyh9OKILYUQP4egrop";
        
        data = data.replace("\r\n", "");
     
        String key="NrV&8279#";

        System.out.println("===============");
        String decryptedData = decryptFile(data, key);
        
        System.out.println(decryptedData);
    }
}

