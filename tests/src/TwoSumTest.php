<?php

namespace Rocko;

use Exception;
use PHPUnit\Framework\TestCase;

/**
 * 給予一組整數陣列及一個數字，這個數字將是陣列中隨便二個數的相加，並回傳此二數的key 值
 * 必需要符合下面的範例
 *
 * Given nums = [2, 7, 11, 15], target = 9,
 * Because nums[0] + nums[1] = 2 + 7 = 9,
 * return [0, 1].
 */
class TwoSumTest extends TestCase
{
    protected $twoSum;
    
    public function setUp()
    {
        /** @var  twoSum */
        $this->twoSum = new TwoSum();
    }
    
    /**
     * @group TwoSum
     * @test
     */
    public function give_2_7_11_15_and_target_9_and_return_0_1()
    {
        //Arrange
        
        //Act
        $actual = $this->twoSum->getTwoSum([2, 7, 11, 15], 9);
        
        //Assert
        $this->assertEquals([0, 1], $actual);
    }
    
    /**
     * @group TwoSum
     * @test
     */
    public function give_2_7_11_15_and_target_13_and_return_0_2()
    {
        //Arrange
        
        //Act
        $actual = $this->twoSum->getTwoSum([2, 7, 11, 15], 13);
        
        //Assert
        $this->assertEquals([0, 2], $actual);
    }
    
    /**
     * @group TwoSum
     * @test
     * @expectedException Exception
     * @expectedExceptionMessage Answer Not Found
     */
    public function give_2_7_11_15_and_target_31_and_return_exception()
    {
        //Arrange
        
        //Act
        $this->twoSum->getTwoSum([2, 7, 11, 15], 31);
        
    }
}