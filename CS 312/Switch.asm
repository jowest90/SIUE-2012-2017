# ############################################################### #
# Switch.ASM 							  #
#							  	  #
# Author: John West 						  #
#						  		  #
# Student ID: 800493221                                           #
#                                                                 #
# Description: A switch statement				  #
# ############################################################### #   


.data
str_1: .asciiz "1. Drinking beer.\n"
str_2: .asciiz "2. study mathmatics.\n"
str_3: .asciiz "3. Go to a party.\n"
str_4: .asciiz "4. Write a paper regarding Eintein's Theory of Relativity.\n"
str_m: .asciiz "Which of the above do you feel like doing? (choose options 1-4)\n"
str_s1: .asciiz "1. Don't drink too much.\n"
str_s2: .asciiz "2. Oh No!!.\n"
str_s3: .asciiz "3. You got a right option.\n"
str_s4: .asciiz "4. Are you sure?\n"

.text
.globl main

main:
	li $s1, 1
	li $s2, 2
	li $s3, 3
	li $s4, 4

	li $v0, 4               # system call #4 (print message)
	la $a0, str_1		# load str_1	
	syscall			# do it

	li $v0, 4               # system call #4 (print message)
	la $a0, str_2		# load str_2	
	syscall			# do it

	li $v0, 4               # system call #4 (print message)
	la $a0, str_3		# load str_3	
	syscall			# do it

	li $v0, 4               # system call #4 (print message)
	la $a0, str_4		# load str_4	
	syscall			# do it
while:
	li $v0, 4               # system call #4 (print message)
	la $a0, str_m		# load str_m	
	syscall			# do it

	li $v0, 5		# enter the first number.
	syscall			# do it
	move $s5, $v0		# store number to $s1

	blt $s5, $s1, while	# if $s5 < $s1 (if num < 1)
	bgt $s5, $s4, while	# if $s5 > $s4 (if num > 4)

	beq $s5, $s1, s1	# if input = $s1, go to s1
	beq $s5, $s2, s2	# if input = $s2, go to s2
	beq $s5, $s3, s3	# if input = $s3, go to s3
	beq $s5, $s4, s4	# if input = $s4, go to s4

s1:
	li $v0, 4               # system call #4 (print message)
	la $a0, str_s1		# load str_r1	
	syscall			# do it
	j endSwitch		#jump to endSwitch
s2:
	li $v0, 4               # system call #4 (print message)
	la $a0, str_s2		# load str_r2	
	syscall			# do it
	j endSwitch		#jump to endSwitch
s3:
	li $v0, 4               # system call #4 (print message)
	la $a0, str_s3		# load str_r3	
	syscall			# do it
	j endSwitch		#jump to endSwitch
s4:
	li $v0, 4               # system call #4 (print message)
	la $a0, str_s4		# load str_r4	
	syscall			# do it
	j endSwitch		#jump to endSwitch

endSwitch:
        jr $31                  # stop the program

# END OF THE LINES ###############################################
