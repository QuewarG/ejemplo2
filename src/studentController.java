public class studentController {

        private student model;
        private studentView view;

        public studentController(student model, studentView view)
        {
            this.model = model;
            this.view = view;
        }

        public void setStudentName(String name)
        {
            model.setName(name);
        }

        public String getStudentName()
        {
            return model.getName();
        }

        public void setStudentRollNo(String rollNo)
        {
            model.setRollNo(rollNo);
        }

        public String getStudentRollNo()
        {
            return model.getRollNo();
        }

        public void updateView()
        {
            view.printStudentDetails(model.getName(), model.getRollNo());
        }
    }

