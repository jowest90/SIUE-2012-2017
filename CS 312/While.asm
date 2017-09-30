# ############################################################### #
# While.ASM 							  #
#							  	  #
# Author: John West 						  #
#						  		  #
# Student ID: 800493221                                           #
#                                                                 #
# Description: A While statement & multiplication arithmetic	  #
# ############################################################### #   


.data

str_m1: .asciiz "Enter the first number ( greater than 0-63): "
str_m2: .asciiz "Enter the second number ( greater than 0-63): "

.text
.globl main

main:
while1:
	li $s0, 0
	li $s1, 63

	li $v0, 4		# system call #4 (print message)
        la $a0, str_m1     	# load str_m1                                 
        syscall			# Do it!

	li $v0, 5		# enter the first number.
	syscall		 	# do it
	move $s2, $v0		# store number to $s0

	blt $s2, $s0, while1	# if $s2 < $s0 (if num < 0)
	bgt $s2, $s1, while1	# if $s2 > $s1 (if num > 63)

while2:
	li $v0, 4		# system call #4 (print message)
        la $a0, str_m2     	# load str_m2                                 
        syscall			# Do it!

	li $v0, 5		# enter the first number.
	syscall		 	# do it
	move $s3, $v0		# store number to $s0

	blt $s3, $s0, while2	# if $s3 < $s0 (if num < 0)
	bgt $s3, $s1, while2	# if $s3 > $s1 (if num > 63)

	mul $s4, $s2, $s3	# mulitply $s2 and $s3 and store to $s4

	li $v0, 1		# system call #1 (print integer)
        move $a0, $s4     	# move integer stored in $s4 to $a0 to be printed.                                 
        syscall			# Do it!


        jr $31                  # stop the program

# END OF THE LINES ###############################################
