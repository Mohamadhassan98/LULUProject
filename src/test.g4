grammar test;
expr : expr '+' expr | INT;
INT : [0-9]+ ;