package seedu.addressbook.commands;

/**
 * Return the size of the address book
 */
public class SizeCommand extends Command {

	public static final String COMMAND_WORD = "size";
	public static final String MESSAGE_USAGE = COMMAND_WORD + ": Outputs the size of the address book "
			+ "Example: " + COMMAND_WORD;

	public static final String MESSAGE_SUCCESS = "Address book contains %d person(s).";

	@Override
	public CommandResult execute() {

		int size = addressBook.size();
		return new CommandResult(String.format(MESSAGE_SUCCESS, size));
	}
}
