window.addEventListener('DOMContentLoaded', function() {
	var successParam = '<%= request.getParameter("success") %>';

	if (successParam === 'true') {
		var successMessage = document.getElementById('success-message');

		// Show the success message
		successMessage.style.opacity = 1;

		// Fade away the success message after 3 seconds
		setTimeout(function() {
			successMessage.style.opacity = 0;
		}, 3000);
	}
});