<?php

namespace Rocko;

use Exception;

class TwoSum
{
    /**
     * 給予一組整數陣列及一個數字，這個數字將是陣列中隨便二個數的相加，並回傳此二數的key值
     * @param $list
     * @param $target
     * @return array
     * @throws Exception
     */
    public function getTwoSum($list , $target)
    {
        $tmpList = [];
        
        foreach ($list as $key => $item) {
            $complate = $target - $item;
            if(key_exists($complate,$tmpList)){
                return [$tmpList[$complate] , $key];
            }
        
            $tmpList[$item] = $key;
        }
        
        throw new Exception("Answer Not Found");
        
    }
}