# CSV Lab

## Learning Goals

- Work with CSV files in Java

## Instructions

You'll create the ability to add people to a list of people that we will maintain
in our program and save to file when the program exits:

- Ask the user if they want to restore the list of people from file. If yes,
  restore from the file you might have saved from a previous run of your
  program. If no, start a brand-new list.
- Regardless of whether you start with a new list or with a list restored from
  your saved file, give the user 3 options:
  - Add a person to the list.
  - Print a list of current persons.
  - Exit the program.
- Adding a person to the list:
  - Ask the user for the person's information.
  - Add the new person to your person's list.
  - Return the user to the 3 options from before.
- Printing a list of current persons:
  - Print the person information for each person on your current list.
  - Return the user to the 3 options from before.
- Exit the program:
  - On program exit, save all the persons on your list to your file.

Hints:

- Re-use the functionality we created in this section. This should give you the
  foundation for reading from and writing to file.
- Refer back to the functionality from Modules 1 and 2 where you gathered input
  from the user.
- Depending on how you write your user list to file, you may end up with an
  empty string for the last line of your file - make sure you guard against that
  when you read the file back.
- If/when you restore the person list from file, make sure to use the same list
  as the list you maintain in your program, as persons added after you restore
  the person list from file should be added to that list.
