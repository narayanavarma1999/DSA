/* class TreeNode {
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
/* 
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

console.log(preOrderTraversal(root)) */
//'use strict'
// console.log(z)
// z = 4


function postTraversal(root) {

  let stack = []
  let ans = []
  let current = root
  let lastvisited = null

  while (current || stack.length) {

    while (current) {
      stack.push(current)``
      current = current.left
    }

    let peekNode = stack[stack.length - 1]

    if (peekNode.right || lastvisited !== peekNode.right) {
      current = current.right
    } else {
      ans.push(peekNode.val)
      lastvisited = stack.pop()
    }
  }

  return ans

}


/* 
                1
    
            2       3
    
     4    5      6      7      
*/

class TreeNode {
  constructor(val) {
    this.val = val;
    this.left = this.right = null;
  }
}

function buildTree(arr) {
  if (!arr.length || arr[0] === null) return null;
  const nodes = arr.map(v => v === null ? null : new TreeNode(v));

  for (let i = 0; i < arr.length; i++) {
    if (nodes[i] !== null) {
      const left = 2 * i + 1;
      const right = 2 * i + 2;
      if (left < arr.length) nodes[i].left = nodes[left];
      if (right < arr.length) nodes[i].right = nodes[right];
    }
  }
  return nodes[0];
}

function bfs(root) {
  console.log(`ROOT:::${JSON.stringify(root)}`)
  if (!root) return [];
  const res = [];
  const q = [root];

  for (let i = 0; i < q.length; i++) {
    const levelSize = q.length - i;
    const level = [];
    for (let k = 0; k < levelSize; k++, i++) {
      const node = q[i];
      level.push(node.val);
      if (node.left) q.push(node.left);
      if (node.right) q.push(node.right);
    }
    i--; // adjust pointer
    res.push(level);
  }
  return res;
}

const arr = [0,2,4,1,null,3,-1,5,1,null,6,null,8];
const root = buildTree(arr);
console.log(bfs(root));

