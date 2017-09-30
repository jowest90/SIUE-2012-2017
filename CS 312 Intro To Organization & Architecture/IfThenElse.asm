# ############################################################### #
# IfThenElse.ASM 						  #
#							  	  #
# Author: John West 						  #
#						  		  #
# Student ID: 800493221                                           #
#                                                                 #
# Description: An If_Then_Else statement			  #
# ############################################################### #  

.data

str_m1: .asciiz "Enter the first number(0-255): "
str_m2: .asciiz "Enter the second number(0-255): "
str_err: .asciiz "the number entered is not in 0-255. Enter another number.\n"  
str_eql: .asciiz "The two numbers are equal.\n"
str_not_eql: .asciiz "The two numbers are NOT equal.\n"

.text
.globl main

main:	
	li $s0, 0		# $s0 = 0
	li $s1, 255		# $s1 = 255
	
while1:
	li $v0, 4               # system call #4 (print message)
	la $a0, str_m1		# load str_m1	
	syscall			# do it

	li $v0, 5		# enter the first number.
	syscall			# do it
	move $s2, $v0		# store number to $s2

	blt $s2, $s0, error1	# if $s2 < $s0 (if num < 0), jump to error1
	bgt $s2, $s1, error1	# if $s2 < $s1 (if num > 255), jump to error1
	j while2		# jump to while2

error1:
	li $v0, 4               # system call #4 (print message)
	la $a0, str_err		# load str_err	
	syscall			# do it
	j while1		# jump to while1

while2:
	li $v0, 4               # system call #4 (print message)
	la $a0, str_m2		# load str_m2	
	syscall			# do it
	
	li $v0, 5		# enter the first number.
	syscall			# do it
	move $s3, $v0		# store number to $s3

	
	blt $s3, $s0, error2	# if $s3 < $s0 (if num < 0), jump to error2
	bgt $s3, $s1, error2	# if $s3 < $s1 (if num > 255), jump to error2
	j If_Then		# jump to If _Then

error2:
	li $v0, 4               # system call #4 (print message)
	la $a0, str_err		# load str_err	
	syscall			# do it
	j while2		# jump to while1
	

If_Then:
	beq $s2, $s3,if_equal	# if $s0 and $s1 are equal
	li $v0, 4               # system call #4 (print message)
	la $a0, str_not_eql	# load str_not_eql	
	syscall			# do it	
	j end_if_else		# jump to end_if _else

if_equal:
	li $v0, 4               # system call #4 (print message)
	la $a0, str_eql		# load str_eql	
	syscall			# do it	
	j end_if_else		# jump to end_if _else	
	
end_if_else:
	jr $31			# end program

# END OF THE LINES ###############################################