class TreeNode {
    constructor(val, left = null, right = null) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

var preOrderTraversal = function (root) {
    const result = []

    processPreOrderTraversal(root, result)
    return result
}

function processPreOrderTraversal(node, result) {
    if (node == null) {
        return
    }

    result.push(node.val)
    processPreOrderTraversal(node.left, result)
    console.log(node.right)
    processPreOrderTraversal(node.rigth, result)
}


/* 
                1
    
            2       3
    
     4    5      6.      7      
*/

// let root = new TreeNode(1);
// root.left = new TreeNode(2);
// root.right = new TreeNode(3);
// root.left.left = new TreeNode(4);
// root.left.right = new TreeNode(5);
// root.right.left = new TreeNode(6)
// root.right.right = new TreeNode(7)

function createTree(arr) {
  if (arr.length === 0) return null;
  
  const root = new TreeNode(arr[0]);
  const queue = [root];
  let i = 1;
  
  while (queue.length > 0 && i < arr.length) {
    const current = queue.shift();
    
    if (arr[i] !== null) {
      current.left = new TreeNode(arr[i]);
      queue.push(current.left);
    }
    i++;
    
    if (i < arr.length && arr[i] !== null) {
      current.right = new TreeNode(arr[i]);
      queue.push(current.right);
    }
    i++;
  }
  
  return root;
}


const input2 = [1, 2, 3, 4, 5];
const root = createTree(input2);

console.log(preOrderTraversal(root))