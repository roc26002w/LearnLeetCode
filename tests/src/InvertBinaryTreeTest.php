<?php

namespace Rocko;

use PHPUnit\Framework\TestCase;

/**
 * 左邊跟右邊的元素交換
 */
class InvertBinaryTreeTest extends TestCase
{
    /** @var  InvertBinaryTree */
    protected $invertBinaryTree;
    
    public function setUp()
    {
        $this->invertBinaryTree = new InvertBinaryTree();
    }
    
    /**
     * @group InvertBinaryTreeTest
     * @test
     */
    public function given_2_4_3_should_return_2_3_4()
    {
        //Arrange
        
        //Act
        $actual = $this->invertBinaryTree->invertTree([2, 4, 3]);
        
        //Assert
        $this->assertEquals([2, 3, 4], $actual);
    }
    
    /**
     * @group InvertBinaryTreeTest
     * @test
     */
    public function given_3_5_1_should_return_3_1_5()
    {
        //Arrange
        
        //Act
        $actual = $this->invertBinaryTree->invertTree([3, 5, 1]);
        
        //Assert
        $this->assertEquals([3, 1, 5], $actual);
    }
    
    
    /**
     * @group InvertBinaryTreeTest
     * @test
     */
    public function given_4_2_7_1_3_6_9_should_return_4_7_2_9_6_3_1()
    {
        //Arrange
        
        //Act
        $actual = $this->invertBinaryTree->invertTree([4, 2, 7, 1, 3, 6, 9]);
        
        //Assert
        $this->assertEquals([4, 7, 2, 9, 6, 3, 1], $actual);
    }
}