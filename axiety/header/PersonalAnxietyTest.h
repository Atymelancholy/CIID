#ifndef LAB_2_PERSONALANXIETY_H
#define LAB_2_PERSONALANXIETY_H

#include <iostream>

class PersonalAnxietyTest : public AnxietyTest {
public:
    PersonalAnxietyTest(int numQuestions, const std::vector<std::string>& questions)
            : AnxietyTest(numQuestions, questions) {}

   /* int calculateResult() override {
        int positiveSum = answers[1] + answers[2] + answers[3] + answers[4] + answers[7] + answers[10] + answers[11] + answers[13] + answers[14] + answers[16] + answers[17] + answers[19];
        int negativeSum = answers[0] + answers[5] + answers[6] + answers[9] + answers[12] + answers[15] + answers[18];
        int result = positiveSum - negativeSum + 35;
        return result;
    }*/
   int calculateResult() override {

       int positiveSum = answers[1] + answers[2] + answers[3] + answers[4] + answers[7] +
                         answers[10] + answers[11] + answers[13] + answers[14] +
                         answers[16] + answers[17] + answers[19];

       int negativeSum = answers[0] + answers[5] + answers[6] + answers[9] +
                         answers[12] + answers[15] + answers[18];

       std::cout << "Positive sum:" << positiveSum;
       std::cout << "Negative sum:" << negativeSum;

       int result = positiveSum - negativeSum + 35;
       std::cout << "Final result:" << result;

       return result;
   }

#include <iostream>
#include <sstream> // Для преобразования массива в строку

   /* void addAnswer(int answer) {
        if (answers.size() < questions.size()) {
            answers.push_back(answer);
            // Вывод содержимого массива для отладки
            std::ostringstream debugStream;
            debugStream << "Added answer: " << answer << " | Current answers: ";
            for (const auto& ans : answers) {
                debugStream << ans << " ";
            }
            std::cout << debugStream.str() << std::endl;
        } else {
            std::cerr << "Error: Attempted to add more answers than questions." << std::endl;
        }
    }*/


       void addAnswer(int answer){
           answers.push_back(answer);
       }

//1 1 1 1 1 1 3 3 3 4 = 19
//1 2 1 1 1 1 3 3 1 1 = 16

    const std::vector<int>& getAnswers() const {
        return answers;
    }
};


#endif
