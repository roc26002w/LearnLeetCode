<?php

namespace Rocko;

class TwoSum
{
    /**
     * 給予一組整數陣列及一個數字，這個數字將是陣列中隨便二個數的相加，並回傳此二數的key值
     * @param $list
     * @param $target
     * @return array
     */
    public function getTwoSum($list , $target)
    {
        foreach ($list as $key => $item) {
            foreach ($list as $key1 => $item1) {
                if($item + $item1 == $target){
                    return [$key , $key1];
                }
            }
        }
    }
}