Summary
-
ExceptionTest
-
    [1] should_customize_exception
    [2] should_customize_exception_continued
    [3] should_be_careful_of_the_order_of_finally_block
    [4] should_use_the_try_pattern
    [5] should_call_closing_even_if_exception_throws
    [6] should_get_method_name_in_stack_frame
    
    Q1: What is the knowledge point of the test? Where is the official document to the knowledge point?
    
    A1: To learn more about and the creation of customized exceptions, the behavior of try - catch - block, the hierarchy of closing the exception classes, and also learning how to access the stack frame. https://www.edureka.co/blog/java-exception-handling

    Q2: Why the test failed at first?
    
    A2: Because the expected values are not set. The Classes are not Implemented

    Q3: Why you corrected the test that way?
    
    A3: 
    Test [1-2] Completed the StringFormatException class by calling the constructors of its extending class using super().
    Test [3] Answered 0 since there is a finally block, it will do everything inside that block before it reaches the return line in the try block.
    Test [4] When ClosableStateReference close() is called, it sets the isClosed variable to true. So I answered true.
    Test [5] The hierarchy of closing a resource starts with whats inside the try block. So I answered ClosableWithException will close first and the on to close would be ClosableWithoutException.
    Test [6] I completed the StackFrameHelper class by creating a new instance of the Exception and getting its stack trace, then just assembled the class name and method name.

    Q4: Do you have further questions on this knowledge point?
    
    A4: None

InheritanceTest
-
    [1] should_be_derived_from_object_class
    [2] should_call_super_class_constructor
    [3] should_call_super_class_constructor_continued
    [4] should_call_super_class_constructor_more
    [5] should_call_super_class_methods
    [6] should_call_most_derived_methods
    [7] should_use_caution_when_dealing_with_array_type
    [8] should_not_make_you_confused
    [9] should_not_make_you_confused_2
    [10] should_use_instance_of_to_determine_inheritance_relationship
    [11] should_use_instance_of_only_in_inheritance_relationship
    [12] should_write_perfect_equals_1
    [13] should_write_perfect_equals_2
    [14] should_write_perfect_equals_3
    [15] should_write_perfect_equals_4
    [16] should_write_perfect_equals_5
    [17] should_write_perfect_equals_6
    [18] should_write_perfect_equals_7

    Q1: What is the knowledge point of the test? Where is the official document to the knowledge point?
    
    A1: To learn more about the initialization of classes and its parent/child classes and also how they inherit methods & constructors from the parent class. To learn about the behavior of overridden methods, and how an object is an instance of its parent class and the classes above its hierarchy. https://www.edureka.co/blog/inheritance-in-java/
    
    Q2: Why the test failed at first?
    
    A2: Because the expected values are not set. The Classes are not Implemented

    Q3: Why you corrected the test that way?
    
    A3: 
    Test [1] Answered Object.class since all objects created have the super class of Object.
    Test [2-5] During class initialization, it will always initialized the parent class first. In some of these test cases, there are parent classes which also have parent classes, so it will call their parent first. I answered the parent's logs first.
    Test [6] The method of BaseClassForOverriding was overridden by the method of DerivedFromBaseClassForOverriding. I answered the method from the derived class.
    Test [7] It will throw an exception since it does not directly/propertly cast the array of SuperClass in the array of DerivedClass.
    Test [8] Overriding happened during NestedDerivedClassWithName, the properties of the BaseClass was set to the DerivedFromBaseClassWithName so it will return the method from the NestedDerivedClassWithName.
    Test [9] No overriding occurred and would return the BaseClassWithName method.
    Test [10] NestedDerivedClassWithName is an instance of itself, DerivedFromBaseClassWithName, and BaseClassWithName since it extends DerivedClass which also extends BaseClass.
    Test [11] Object is not an instance of Long but an instance of Integer since the object was initialized by the Integer class.
    Test [12-18] I completed the function PersonForEquals by first checking if the object compared to it is not null and if it is not an instance of PersonForEquals object. If they passed those conditions, it would check if the name & year are the same and return the result. For further validation, hashCode was overridden, the hashCode of the name is taken plus the value of the age.

    Q4: Do you have further questions on this knowledge point?
    
    A4: None

ObjectTest
-
    [1] should_point_to_the_same_object
    [2] should_point_to_different_object
    [3] should_initialized_to_default_value
    [4] should_pass_by_value
    [5] should_pass_by_value_continued
    [6] should_modify_internal_state
    [7] should_choose_method_at_compile_time
    [8] should_choose_the_most_specific_overload
    [9] should_calling_another_constructor
    [10] should_get_initialization_ordering
    [11] should_get_message_of_var_length_parameters
    [12] should_get_message_of_var_length_parameters_2
    
    Q1: What is the knowledge point of the test? Where is the official document to the knowledge point?
    
    A1: To learn more about referencing an object, the default values of primitive types and objects, the hierarchical initialization order of Field -> Block Statements -> Constructors Arguments -> Default Constructor. Multiple constructors and methods, having the concept of Polymorphism. https://www.edureka.co/blog/java-objects-and-classes/ & https://www.edureka.co/blog/java-object/

    Q2: Why the test failed at first?
    
    A2: Because the expected values are not set. The Classes are not Implemented

    Q3: Why you corrected the test that way?
    
    A3: 
    Test [1] They both are referencing the same object.
    Test [2] They are both initialized differently thus they are not the same.
    Test [3] The variables are not initialized during run time so it sets it to default, for Objects such as String and LocalDate it is null while for the primitive int it is 0.
    Test [4] The answer is 5 since the value passed was the value updated and thus not updating the one inside the test function
    Test [5] The answer is the sameReference since it was initialized using the object of objectReference.
    Test [6] The answer is Updated Name since object passed is referencing the same object.
    Test [7] The answer is methodWithOneParameter(Object) since it referencing Object class during compile time.
    Test [8] The answer is methodWithTwoParameters(String, Integer) as it choose the most specific method with the same parameters.
    Test [9] The answer is Untitled as it called its other parameter using the this function along with its parameter.
    Test [10] During initialization the hierarchy is Field -> Block Statements -> Constructors Arguments -> Default Constructor.
    Test [11-12] Since the parameters for the function are indefinite number of objects it will still process it the same way.

    Q4: Do you have further questions on this knowledge point?
    
    A4: None
