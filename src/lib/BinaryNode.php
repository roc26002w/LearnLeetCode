<?php

namespace Rocko\lib;

class BinaryNode
{
    public $value;
    public $left;
    public $right;
    
    /**
     * BinaryNode constructor.
     * @param $value
     */
    public function __construct($value)
    {
        $this->value = $value;
    }
}