import java.util.*;

public class HashMapImplement {
    
    static class HashMap<K, V> {
        
        private class Node {
            K key;
            V value;

            Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }

        private int n;
        private int N;
        private LinkedList<Node> bucket[];

        @SuppressWarnings("unchecked")
        public HashMap() {
            this.n = 0;
            this.N = 4;
            this.bucket = new LinkedList[N];

            for (int i = 0; i < N; i++) {
                bucket[i] = new LinkedList<>();
            }
        }
        
        public void put(K key, V value) {
            int bi = hashFunction(key);

            int di = searchInLL(bi, key);

            if (di == -1) {
                bucket[bi].add(new Node(key, value));
                n++;
            } else {
                Node n = bucket[bi].get(di);
                n.value = value;
            }

            double lambda = (double) n / N;
            if (lambda > 2) {
                rehash();
            }
        }
        
        public int hashFunction(K key) {
            int bi = key.hashCode();
            bi = Math.abs(bi);
            return bi % N;
        }

        public int searchInLL(int bi, K key) {
            int di = 0;
            LinkedList<Node> ll = bucket[bi];
            for (Node n : ll) {
                if (n.key == key) {
                    return di;
                }
                di++;
            }
            return -1;
        }

        @SuppressWarnings("unchecked")
        public void rehash() {
            LinkedList<Node> oldBucket[] = bucket;
            bucket = new LinkedList[N * 2];
            N = N * 2;

            for (int i = 0; i < N; i++) {
                bucket[i] = new LinkedList<>();
            }

            for (LinkedList<Node> ll : oldBucket) {
                for (Node n : ll) {
                    put(n.key, n.value);
                }
            }
        }

        public V get(K key) {
            int bi = hashFunction(key);
            int di = searchInLL(bi, key);

            if (di == -1) {
                return null;
            }

            return bucket[bi].get(di).value;
        }

        public V remove(K key) {
            int bi = hashFunction(key);
            int di = searchInLL(bi, key);

            if (di == -1) {
                return null;
            }
            Node nn = bucket[bi].remove(di);
            n--;
            return nn.value;
        }

        public boolean containsKey(K key) {
            int bi = hashFunction(key);
            int di = searchInLL(bi, key);

            return di != -1;
        }

        public ArrayList<K> keySet() {
            
            ArrayList<K> list = new ArrayList<>();
            for (LinkedList<Node> ll : bucket) {
                for (Node nn : ll) {
                    list.add(nn.key);
                }
            }

            return list;
        }

    }

}