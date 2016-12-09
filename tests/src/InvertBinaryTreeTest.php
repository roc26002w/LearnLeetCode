<?php

namespace Rocko;

use PHPUnit\Framework\TestCase;

/**
 * 左邊跟右邊的元素交換
 */
class InvertBinaryTreeTest extends TestCase
{
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
        $actual = $this->invertBinaryTree->invertTree([2, 3, 4]);
        
        //Assert
        $this->assertEquals([2, 3, 4], $actual);
    }
}