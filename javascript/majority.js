var majorityElement = function (nums) {
    /*   let count = 0
      let current = 0
      for (let i = 0; i < nums.length; i++) {
          if (count == 0) {
              current = nums[i]
          }
          count += (nums[i] === current) ? 1 : -1
      }
      return current */

    for (let i = 0; i <  nums.length; i++) {
        let count = 0;
        for (let j = 0; j < nums.length; j++) {
            if(nums[i]==nums[j]){
                count++;
            }
        }
        if(count>Math.floor(nums.length/2)){
            return nums[i]
        }
    }
};


console.log(majorityElement([6, 5, 5]))