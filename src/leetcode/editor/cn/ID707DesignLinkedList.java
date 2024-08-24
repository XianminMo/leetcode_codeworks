package leetcode.editor.cn;

public class ID707DesignLinkedList {
	public static void main(String[] args) {
		Solution solution = new ID707DesignLinkedList().new Solution();
		StringBuilder sb = new StringBuilder();
		
		//执行测试
		
		System.out.println(sb);		
	}
//leetcode submit region begin(Prohibit modification and deletion)
class MyLinkedList {
    private class Node {
        private int val;
        private Node next;

        public Node() {}
        public Node(int val) {
            this.val = val;
        }
    }

    private Node sentinel;
    private int size;

    public MyLinkedList() {
        this.sentinel = new Node();
        this.size = 0;
    }
    
    public int get(int index) {
        Node cur = sentinel.next;
        int count = 0;
        while (cur != null) {
            if (count == index) {
                return cur.val;
            }
            count += 1;
            cur = cur.next; // 移动到下一个节点
        }
        return -1; // index无效
    }
    
    public void addAtHead(int val) {
        addAtIndex(0, val);
    }
    
    public void addAtTail(int val) {
        addAtIndex(size, val);
    }
    
    public void addAtIndex(int index, int val) {
        if (index > size || index < 0) {
            return;
        }
        Node newNode = new Node(val);
        Node cur = sentinel;
        int count = 0;

        // 遍历找到要插入的位置，cur指向index上一个节点
        while (count < index) {
            cur = cur.next;
            count++;
        }

        newNode.next = cur.next;
        cur.next = newNode;
        size++;
    }
    
    public void deleteAtIndex(int index) {
        if (index >= size || index < 0) {
            return;
        }

        Node cur = sentinel;
        int count = 0;
        // 遍历找到要删除的节点，cur指向上一节点
        while (count < index) {
            cur = cur.next;
            count++;
        }
        cur.next = cur.next.next;
        size--;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */
//leetcode submit region end(Prohibit modification and deletion)

}
