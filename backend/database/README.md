# E-Learning Platform Database

## Database Schema

The database consists of the following tables:

### `Users`

Stores information about users of the platform.

- `id_user`: Unique identifier for the user.
- `username`: The user's chosen username.
- `email`: The user's email address.

### `Roles`

Defines the various roles users can have within the platform.

- `id_role`: Unique identifier for the role.
- `role_name`: The name of the role (e.g., 'student', 'instructor').

### `UserRoles`

Associates users with roles.

- `id_user`: Foreign key to the associated user.
- `id_role`: Foreign key to the associated role.

### `Subjects`, `Modules`, `Lessons`, `Resources`, `Enrollments`, `ChatInteractions`, `Assessments`, `AssessmentResults`, `Feedback`

(No changes to these tables; retain their descriptions from the original `README.md`)

### `FrequentlyAskedQuestions`

Stores frequently asked questions and their answers to help scale user support.

- `id_faq`: Unique identifier for the FAQ entry.
- `question`: The frequently asked question.
- `answer`: The provided answer.
- `times_asked`: The number of times this question has been asked.

## Database Relationships

- Users can have multiple roles and engage in different activities based on their roles.
- Users can enroll in multiple subjects.
- Subjects can contain multiple modules.
- Modules can contain multiple lessons.
- Subjects can have multiple resources associated with them.
- Users can interact with Chat GPT multiple times and about different lessons.
- Lessons can have multiple assessments.
- Users can have multiple assessment results.
- Lessons can receive multiple feedback entries from different users.

## Integration with Chat GPT

The `ChatInteractions` table is designed to store the conversation logs between the user and Chat GPT, including the initial query response. When implementing the backend logic, ensure to capture the `interaction_time`, `user_question`, `gpt_response`, and `initial_query_response` accurately to provide a seamless user experience.

## Security Considerations

Ensure that all interactions with the database, especially those involving user information, are handled securely. Do not store passwords directly; if required, use hashing and salting techniques. Implement proper access controls for different user roles, ensuring that only authorized personnel can create, edit, add, or delete courses, lessons, and modules.

## Role-Based Access Control (RBAC)

With the introduction of the `Roles` and `UserRoles` tables, the platform is now capable of handling role-based access controls internally. Different levels of access and permissions are granted based on the roles associated with each user. Backend logic should be designed to query these tables and enforce access controls accordingly.

## Managing Roles Without Auth0

Since roles are now managed within the platform's database, it is necessary to implement backend logic that:

1. Authenticates the user (possibly still using Auth0 for authentication only).
2. Queries the `UserRoles` table to retrieve the user's roles.
3. Applies the appropriate permissions based on the user's roles.
