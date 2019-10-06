import javax.xml.soap.Node;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

class AANode {

        AANode left, right;
        int element, level;

        public AANode() {
            this.element = 0;
            this.left = this;
            this.right = this;
            this.level = 0;
        }

        public AANode(int ele) {

            this(ele, null, null);
        }

        public AANode(int ele, AANode left, AANode right) {
            this.element = ele;
            this.left = left;
            this.right = right;
            this.level = 1;

        }
    }

    class AATree {

        public AANode root;
        public static AANode nil = new AANode();

        public AATree() {
            root = nil;
        }

        public AATree(int[] array) {
            this();
            for (int i = 0; i < array.length; i++) {
                this.insert(array[i]);
            }
        }

        public boolean isEmpty() {
            return root == nil;
        }

        public void clear() {
            root = nil;
        }

        public void changeTree(int x,int k,int m) {
           root = changeTree(root, x, k, m);
        }

        public AANode changeTree(AANode T, int n, int k, int m) {
            AANode temp = search(n);
            if (temp != nil) {
                temp = delete(k);
                temp = insert(m);
            }
            return temp;
        }

        private AANode decreaseLevel(AANode T) {
            int shouldBe = Math.min(T.left.level, T.right.level) + 1;
            if (shouldBe < T.level) {
                T.level = shouldBe;
                if (shouldBe < T.right.level)
                    T.right.level = shouldBe;
            }
            return T;
        }




        public AANode insert(int x) {
            root = insert(x, root);
            return root;
        }


        public AANode delete(int val) {
            return delete(val, root);
        }

        public AANode minimum(AANode T) {
            if (T.left == nil) {
                return T;
            } else {
                return minimum(T.left);
            }
        }


        private AANode delete(int X, AANode T) {

            if (T == nil) {
                return nil;
            }
                if (X < T.element) {
                    T.left = delete(X, T.left);
                }
                else if (X > T.element){
                    T.right = delete(X,T.right);
                }
                else {
                    if (T.left == nil && T.right == nil) {
                        return nil;
                    }
                    else if (T.left != nil && T.right == nil) {
                      T = T.left;
                    }
                    else if (T.left == nil && T.right != nil) {
                        T = T.right;
                    }
                    else  {
                        AANode temp = T;
                        // Finding minimum element from right
                        AANode minNodeForRight = minimum(temp.right);
                        // Replacing current node with minimum node from right subtree
                        T.element = minNodeForRight.element;
                        // Deleting minimum node from right now
                        T.right = delete(minNodeForRight.element,T.right);
                    }
                }
                return T;
        }


        public AANode insert(int X, AANode T) {
            if (T == nil)
                T = new AANode(X, nil, nil);
            else if (X < T.element)
                T.left = insert(X, T.left);
            else if (X > T.element)
                T.right = insert(X, T.right);
            else
                return T;
            T = skew(T);
            T = split(T);
            return T;
        }

        private AANode skew(AANode T) {

            if (T == nil)
                return nil;
            else if (T.left == nil)
                return T;
            else if (T.left.level == T.level) {
                AANode L = T.left;
                T.left = L.right;
                L.right = T;
                return L;
            } else
                return T;
        }

        private AANode split(AANode T) {

            if (T == nil)
                return nil;
            else if (T.right == nil || T.right.right == nil)
                return T;
            else if (T.level == T.right.right.level) {
                AANode R = T.right;
                T.right = R.left;
                R.left = T;
                R.level = R.level + 1;
                return R;
            } else
                return T;
        }

        public int countNodes() {
            return countNodes(root);
        }

        private int countNodes(AANode r) {
            if (r == nil)
                return 0;
            else {
                int l = 1;
                l += countNodes(r.left);
                l += countNodes(r.right);
                return l;
            }
        }

        public AANode search(int val) {
            return search(root, val);
        }

        private AANode search(AANode r, int val) {
            AANode temp = nil;

            int min = 10000;

            while (r != nil) {
                int rval = r.element;

                if (val - rval < 0 && rval - val < min) {
                    r = r.left;
                    min = rval - val;
                } else if (val - rval > 0)
                    r = r.right;
                else if (val - rval == 0) {
                    temp = r;
                    min = 0;
                    break;
                }
            }

            if (min == 10000) {
                System.out.println("Извините,размер вашей ленты превышает размер плотен,которые есть в наличии");
                return temp;
            } else {
                delete(r.element);
                insert(min);
                return temp;
            }
        }

        public void inorder() {
            inorder(root);
        }

        private void inorder(AANode r) {

            if (r != nil) {
                inorder(r.left);
                System.out.print(r.element + " ");
                inorder(r.right);
            }
        }

        public void preorder() {
            preorder(root);
        }



        private void preorder(AANode r) {

            if (r != nil) {
                System.out.print(r.element + " ");
                preorder(r.left);
                preorder(r.right);
            }
        }

        public void postorder() {
            postorder(root);
        }

        public void postorder(AANode r) {
            if (r != nil) {
                postorder(r.left);
                postorder(r.right);
                System.out.print(r.element + " ");
            }

        }
    }


