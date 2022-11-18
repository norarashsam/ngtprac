<?php
$m=new MongoClient();
echo "\nConnection to Database Successfully";
$db=$m->TYITDB;
echo "\nDatabase selected successfully";
$col=$db->TYITCOL;
echo "\nCollection selected successfully";

$col->update(array("name"=>"Rohit"),array('$set'=>array("age"=>21)));
echo "\nDocument updated successfully";
?>