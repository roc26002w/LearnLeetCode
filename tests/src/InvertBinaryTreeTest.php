<?php

namespace Rocko;

use PHPUnit\Framework\TestCase;
use Rocko\lib\BinaryNode;

/**
 * 左邊跟右邊的元素交換
 */
class InvertBinaryTreeTest extends TestCase
{
    /** @var  InvertBinaryTree */
    protected $invertBinaryTree;
    /** @var  BinaryNode */
    protected $binaryNode;
    
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
        $this->binaryNode = new BinaryNode(2);
        $this->binaryNode->left = new BinaryNode(4);
        $this->binaryNode->right = new BinaryNode(3);
        
        //Act
        $actual = $this->invertBinaryTree->invertTree($this->binaryNode);
        //Assert
        $this->assertEquals($actual->value, 2);
        $this->assertEquals($actual->left->value, 3);
        $this->assertEquals($actual->right->value, 4);
    }
    
    /**
     * @group InvertBinaryTreeTest
     * @test
     */
    public function given_3_5_1_should_return_3_1_5()
    {
        //Arrange
        $this->binaryNode = new BinaryNode(3);
        $this->binaryNode->left = new BinaryNode(5);
        $this->binaryNode->right = new BinaryNode(1);
        //Act
        $actual = $this->invertBinaryTree->invertTree($this->binaryNode);
        
        //Assert
        $this->assertEquals($actual->value, 3);
        $this->assertEquals($actual->left->value, 1);
        $this->assertEquals($actual->right->value, 5);
    }
    
    /**
     * @group InvertBinaryTreeTest
     * @test
     */
    public function given_4_2_7_1_3_6_9_should_return_4_7_2_9_6_3_1()
    {
        //Arrange
        $this->binaryNode = new BinaryNode(4);
        $this->binaryNode->left = new BinaryNode(2);
        $this->binaryNode->right = new BinaryNode(7);
        $this->binaryNode->left->left = new BinaryNode(1);
        $this->binaryNode->left->right = new BinaryNode(3);
        $this->binaryNode->right->left = new BinaryNode(6);
        $this->binaryNode->right->right = new BinaryNode(9);
        //Act
        $actual = $this->invertBinaryTree->invertTree($this->binaryNode);
        
        //Assert
        $this->assertEquals($actual->value, 4);
        $this->assertEquals($actual->left->value, 7);
        $this->assertEquals($actual->right->value, 2);
        $this->assertEquals($actual->left->left->value, 9);
        $this->assertEquals($actual->left->right->value, 6);
        $this->assertEquals($actual->right->left->value, 3);
        $this->assertEquals($actual->right->right->value, 1);
    }
}